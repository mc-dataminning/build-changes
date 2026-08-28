public interface fuq {
   fus a();

   public static record a(fus a) implements fuq {
      @Override
      public fus a() {
         return this.a.a() == fur.b ? this.a : fus.b;
      }

      public fus b() {
         return this.a;
      }
   }

   public static class b implements fuq {
      @Override
      public fus a() {
         return fus.b;
      }
   }

   public static record c(boolean a) implements fuq {
      @Override
      public fus a() {
         return this.a ? fus.b : fus.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
