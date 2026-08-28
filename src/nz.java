import javax.annotation.Nullable;

public interface nz {
   aku a = aku.b("recipes/root");

   nz a(String var1, aq<?> var2);

   nz a(@Nullable String var1);

   cwj a();

   void a(ob var1, akt<dbc<?>> var2);

   default void a(ob $$0) {
      this.a($$0, akt.a(mc.bk, a(this.a())));
   }

   default void a(ob $$0, String $$1) {
      aku $$2 = a(this.a());
      aku $$3 = aku.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, akt.a(mc.bk, $$3));
      }
   }

   static aku a(dgf $$0) {
      return mb.g.b($$0.j());
   }

   static dap a(oa $$0) {
      return switch ($$0) {
         case a -> dap.a;
         case e, f -> dap.c;
         case c -> dap.b;
         default -> dap.d;
      };
   }
}
