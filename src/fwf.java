public interface fwf {
   fwh a();

   public static record a(fwh a) implements fwf {
      @Override
      public fwh a() {
         return this.a.a() == fwg.b ? this.a : fwh.b;
      }

      public fwh b() {
         return this.a;
      }
   }

   public static class b implements fwf {
      @Override
      public fwh a() {
         return fwh.b;
      }
   }

   public static record c(boolean a) implements fwf {
      @Override
      public fwh a() {
         return this.a ? fwh.b : fwh.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
