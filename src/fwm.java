public interface fwm {
   fwo a();

   public static record a(fwo a) implements fwm {
      @Override
      public fwo a() {
         return this.a.a() == fwn.b ? this.a : fwo.b;
      }

      public fwo b() {
         return this.a;
      }
   }

   public static class b implements fwm {
      @Override
      public fwo a() {
         return fwo.b;
      }
   }

   public static record c(boolean a) implements fwm {
      @Override
      public fwo a() {
         return this.a ? fwo.b : fwo.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
