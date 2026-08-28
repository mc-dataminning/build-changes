public interface fyq {
   fys a();

   public static record a(fys a) implements fyq {
      @Override
      public fys a() {
         return this.a.a() == fyr.b ? this.a : fys.b;
      }

      public fys b() {
         return this.a;
      }
   }

   public static class b implements fyq {
      @Override
      public fys a() {
         return fys.b;
      }
   }

   public static record c(boolean a) implements fyq {
      @Override
      public fys a() {
         return this.a ? fys.b : fys.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
