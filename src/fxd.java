public interface fxd {
   fxf a();

   public static record a(fxf a) implements fxd {
      @Override
      public fxf a() {
         return this.a.a() == fxe.b ? this.a : fxf.b;
      }

      public fxf b() {
         return this.a;
      }
   }

   public static class b implements fxd {
      @Override
      public fxf a() {
         return fxf.b;
      }
   }

   public static record c(boolean a) implements fxd {
      @Override
      public fxf a() {
         return this.a ? fxf.b : fxf.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
