import javax.annotation.Nullable;

public interface fwx {
   Object b = new Object();
   int c = 160;
   int d = 32;

   fwx.a a();

   void a(fwy var1, long var2);

   @Nullable
   default awq b() {
      return null;
   }

   void a(ftz var1, ftx var2, long var3);

   default Object g() {
      return b;
   }

   default int c() {
      return 160;
   }

   default int d() {
      return 32;
   }

   default int h() {
      return azq.e(this.d(), 32);
   }

   public static enum a {
      a(awr.BC),
      b(awr.BD);

      private final awq c;

      private a(final awq $$0) {
         this.c = $$0;
      }

      public void a(hqf $$0) {
         $$0.a(hou.a(this.c, 1.0F, 1.0F));
      }
   }
}
