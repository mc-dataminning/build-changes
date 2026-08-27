import javax.annotation.Nullable;

public interface lr {
   aeu a = new aeu("recipes/root");

   lr a(String var1, am<?> var2);

   lr a(@Nullable String var1);

   civ a();

   void a(lt var1, aeu var2);

   default void a(lt $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(lt $$0, String $$1) {
      aeu $$2 = a(this.a());
      aeu $$3 = new aeu($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static aeu a(cpp $$0) {
      return jd.i.b($$0.k());
   }
}
