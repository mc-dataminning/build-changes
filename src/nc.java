import javax.annotation.Nullable;

public interface nc {
   ajh a = new ajh("recipes/root");

   nc a(String var1, an<?> var2);

   nc a(@Nullable String var1);

   cqh a();

   void a(ne var1, ajh var2);

   default void a(ne $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(ne $$0, String $$1) {
      ajh $$2 = a(this.a());
      ajh $$3 = new ajh($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static ajh a(cxa $$0) {
      return ki.h.b($$0.l());
   }

   static ctf a(nd $$0) {
      return switch ($$0) {
         case a -> ctf.a;
         case e, f -> ctf.c;
         case c -> ctf.b;
         default -> ctf.d;
      };
   }
}
