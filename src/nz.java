import javax.annotation.Nullable;

public interface nz {
   akv a = akv.b("recipes/root");

   nz a(String var1, aq<?> var2);

   nz a(@Nullable String var1);

   cwm a();

   void a(ob var1, aku<dbf<?>> var2);

   default void a(ob $$0) {
      this.a($$0, aku.a(mc.bk, a(this.a())));
   }

   default void a(ob $$0, String $$1) {
      akv $$2 = a(this.a());
      akv $$3 = akv.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, aku.a(mc.bk, $$3));
      }
   }

   static akv a(dgi $$0) {
      return mb.g.b($$0.j());
   }

   static das a(oa $$0) {
      return switch ($$0) {
         case a -> das.a;
         case e, f -> das.c;
         case c -> das.b;
         default -> das.d;
      };
   }
}
