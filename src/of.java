import javax.annotation.Nullable;

public interface of {
   akt a = new akt("recipes/root");

   of a(String var1, ao<?> var2);

   of a(@Nullable String var1);

   cuc a();

   void a(oh var1, akt var2);

   default void a(oh $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(oh $$0, String $$1) {
      akt $$2 = a(this.a());
      akt $$3 = new akt($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static akt a(dbz $$0) {
      return lh.h.b($$0.q());
   }

   static cyo a(og $$0) {
      return switch ($$0) {
         case a -> cyo.a;
         case e, f -> cyo.c;
         case c -> cyo.b;
         default -> cyo.d;
      };
   }
}
