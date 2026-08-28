public interface fvt {
   fvv a();

   public static record a(fvv a) implements fvt {
      @Override
      public fvv a() {
         return this.a.a() == fvu.b ? this.a : fvv.b;
      }

      public fvv b() {
         return this.a;
      }
   }

   public static class b implements fvt {
      @Override
      public fvv a() {
         return fvv.b;
      }
   }

   public static record c(boolean a) implements fvt {
      @Override
      public fvv a() {
         return this.a ? fvv.b : fvv.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
