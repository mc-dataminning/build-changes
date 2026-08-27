public interface ui {
   ui.b a();

   ui.b a(String var1);

   ui.b a(byte var1);

   ui.b a(short var1);

   ui.b a(int var1);

   ui.b a(long var1);

   ui.b a(float var1);

   ui.b a(double var1);

   ui.b a(byte[] var1);

   ui.b a(int[] var1);

   ui.b a(long[] var1);

   ui.b a(un<?> var1, int var2);

   ui.a a(un<?> var1);

   ui.a a(un<?> var1, String var2);

   ui.a b(un<?> var1, int var2);

   ui.b b();

   ui.b b(un<?> var1);

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static enum b {
      a,
      b,
      c;
   }
}
