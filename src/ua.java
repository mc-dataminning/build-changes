public interface ua {
   tm a();

   void a(aks var1, boolean var2, ti.a var3);

   static ua a(ub $$0) {
      return (ua)($$0.g() ? new ua.a($$0.c()) : new ua.b($$0));
   }

   public static record a(tm a) implements ua {
      @Override
      public void a(aks $$0, boolean $$1, ti.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(ub a) implements ua {
      @Override
      public tm a() {
         return this.a.c();
      }

      @Override
      public void a(aks $$0, boolean $$1, ti.a $$2) {
         ub $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public ub b() {
         return this.a;
      }
   }
}
