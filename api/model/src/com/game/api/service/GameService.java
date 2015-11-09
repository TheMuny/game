package com.game.api.service;

import com.game.api.model.*;
import com.game.api.model.monster.Monster;

/**
 * Created by denis.selutin on 5/29/2015.
 */
public interface GameService {
    public com.game.api.model.Character getUserCharacter();
    public Monster[] getMonsters();
    public void calculateNextStep();
}
/* II ������� - ����. 
� ��� ���� ������� � ��������. � ������� ������� ���� ���� ���, �����, ����� � ������. 
�� �� ������ ���� � � ���������.
������ ����������� � �������� ������������� ����������� �������� � ��������� (�� ��� ����� � �� � �����).
����� ��� �������� �������� ��������� � ������� �����������(������ ����� ������������� - �� �� ������ �����������). 
����� ������������ ��������� ������ � �������� �������� ����� �������� � ������������� ����� ���. 
������ - ����������� ���� �� ������ ������������� �����������.

���������� � ��������� �� ������ ����� �� ���-����
https://github.com/denis-selutin/Source-IT/tree/master/examples/ex6/src/com

������� � �������� ��������� �����������: 
���� ������� ������� ������ � ���������, ������ - ������ ����������. ��� �� ������ ����������.

�������� ������:
http://easy-code.ru/lesson/java-nested-classes
http://www.quizful.net/post/inner-classes-java
http://habrahabr.ru/post/30444/

P.S. ����������� �� ���� - �����������! �� ������� - �����. 
P.P.S. ����� �� ����� ���������� ����������, �� �� ��� ����� ��� ����� �������� :)

-- 
Best regards,
Denis
*/