public interface fyo {
   fyq a();

   public static record a(fyq a) implements fyo {
      @Override
      public fyq a() {
         return this.a.a() == fyp.b ? this.a : fyq.b;
      }

      public fyq b() {
         return this.a;
      }
   }

   public static class b implements fyo {
      @Override
      public fyq a() {
         return fyq.b;
      }
   }

   public static record c(boolean a) implements fyo {
      @Override
      public fyq a() {
         return this.a ? fyq.b : fyq.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
