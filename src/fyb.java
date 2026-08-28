public interface fyb {
   fyd a();

   public static record a(fyd a) implements fyb {
      @Override
      public fyd a() {
         return this.a.a() == fyc.b ? this.a : fyd.b;
      }

      public fyd b() {
         return this.a;
      }
   }

   public static class b implements fyb {
      @Override
      public fyd a() {
         return fyd.b;
      }
   }

   public static record c(boolean a) implements fyb {
      @Override
      public fyd a() {
         return this.a ? fyd.b : fyd.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
