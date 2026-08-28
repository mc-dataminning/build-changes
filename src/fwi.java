import javax.annotation.Nullable;

public interface fwi {
   Object b = new Object();
   int c = 160;
   int d = 32;

   fwi.a a();

   void a(fwj var1, long var2);

   @Nullable
   default awx b() {
      return null;
   }

   void a(ftk var1, fti var2, long var3);

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
      return azz.e(this.d(), 32);
   }

   public static enum a {
      a(awy.BC),
      b(awy.BD);

      private final awx c;

      private a(final awx $$0) {
         this.c = $$0;
      }

      public void a(hpt $$0) {
         $$0.a(hoi.a(this.c, 1.0F, 1.0F));
      }
   }
}
