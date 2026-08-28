public interface fwy {
   fxa a();

   public static record a(fxa a) implements fwy {
      @Override
      public fxa a() {
         return this.a.a() == fwz.b ? this.a : fxa.b;
      }

      public fxa b() {
         return this.a;
      }
   }

   public static class b implements fwy {
      @Override
      public fxa a() {
         return fxa.b;
      }
   }

   public static record c(boolean a) implements fwy {
      @Override
      public fxa a() {
         return this.a ? fxa.b : fxa.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
