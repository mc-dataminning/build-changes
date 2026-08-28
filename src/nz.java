import javax.annotation.Nullable;

public interface nz {
   akv a = akv.b("recipes/root");

   nz a(String var1, aq<?> var2);

   nz a(@Nullable String var1);

   cwl a();

   void a(ob var1, aku<dbe<?>> var2);

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

   static akv a(dgh $$0) {
      return mb.g.b($$0.j());
   }

   static dar a(oa $$0) {
      return switch ($$0) {
         case a -> dar.a;
         case e, f -> dar.c;
         case c -> dar.b;
         default -> dar.d;
      };
   }
}
