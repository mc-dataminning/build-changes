import javax.annotation.Nullable;

public class hex {
   private boolean a;
   @Nullable
   private her.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hex(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hes.a $$0) {
      if (this.c != null) {
         $$0.a(her.j, !this.c.equals("vanilla"));
      }

      $$0.a(her.k, this.a());
   }

   private her.c a() {
      gdv $$0 = fke.Q().S();
      if ($$0 != null && $$0.e()) {
         return her.c.a;
      } else {
         return fke.Q().U() ? her.c.b : her.c.c;
      }
   }

   public boolean a(heo $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hep.b, $$0x -> {
            $$0x.a(her.n, this.b);
            if (this.d != null) {
               $$0x.a(her.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dfj $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? her.b.e : her.b.a;
         case b -> her.b.b;
         case c -> her.b.c;
         case d -> her.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
