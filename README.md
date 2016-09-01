Student: Yaraslau Karotkin

Here is a short report.

We've drafted a structure of installing application stack.
That means Tomcat depends on JDK 1.7.0
Everything will be started in the end of all changes.

We installed Java, Nginx, Tomcat, Jenkins.
And add to conf.d of Nginx config as customized virtual host.

After we installed tomcat and webapps dependencies. And add customized server.xml to config.
Also we've set chmod to CATALINA_HOME

For jenkins we have to set up jenkins user and add him to sudoers file.
That is the time to jenkins install. We have to change a lot of config files.
And we have to put on maven config too.
The next put on is jobs.
And the next but the most massive is plugins directory with willing plugins for jenkins (git and etc)
Also change owner for jenkins home, chown -r jenkins.jenkins


That is the time to start Nginx, Tomcat and Jenkins



Screen of started Jenkins.
![alt tag](https://github.com/MNTLab/cm-ansible-1/blob/yaraslau_karotikin/vagrant/ansible/src/screens/1.png)
Screen of started Tomcat.
![alt tag](https://github.com/MNTLab/cm-ansible-1/blob/yaraslau_karotikin/vagrant/ansible/src/screens/4.png?raw=true)
Screen of started Job by SCM
![alt tag](https://github.com/MNTLab/cm-ansible-1/blob/yaraslau_karotikin/vagrant/ansible/src/screens/6.png?raw=true)
Screen of deployed Job
![alt tag](https://github.com/MNTLab/cm-ansible-1/blob/yaraslau_karotikin/vagrant/ansible/src/screens/5.png?raw=true)
Screen of deployed application
![alt tag](https://github.com/MNTLab/cm-ansible-1/blob/yaraslau_karotikin/vagrant/ansible/src/screens/7.png?raw=true)
