import javax.annotation.Nullable;

public class gir {
   private boolean a;
   @Nullable
   private gil.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gir(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gim.a $$0) {
      if (this.c != null) {
         $$0.a(gil.j, !this.c.equals("vanilla"));
      }

      $$0.a(gil.k, this.a());
   }

   private gil.c a() {
      fne $$0 = euk.N().P();
      if ($$0 != null && $$0.e()) {
         return gil.c.a;
      } else {
         return euk.N().R() ? gil.c.b : gil.c.c;
      }
   }

   public boolean a(gii $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gij.b, $$0x -> {
            $$0x.a(gil.n, this.b);
            if (this.d != null) {
               $$0x.a(gil.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(csv $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gil.b.e : gil.b.a;
         case b -> gil.b.b;
         case c -> gil.b.c;
         case d -> gil.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
