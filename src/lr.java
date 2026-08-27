import javax.annotation.Nullable;

public interface lr {
   aez a = new aez("recipes/root");

   lr a(String var1, am<?> var2);

   lr a(@Nullable String var1);

   cjg a();

   void a(lt var1, aez var2);

   default void a(lt $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(lt $$0, String $$1) {
      aez $$2 = a(this.a());
      aez $$3 = new aez($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static aez a(cqa $$0) {
      return jb.i.b($$0.k());
   }
}
