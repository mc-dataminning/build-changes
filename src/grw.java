import javax.annotation.Nullable;

public class grw {
   private boolean a;
   @Nullable
   private grq.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public grw(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(grr.a $$0) {
      if (this.c != null) {
         $$0.a(grq.j, !this.c.equals("vanilla"));
      }

      $$0.a(grq.k, this.a());
   }

   private grq.c a() {
      fwa $$0 = fcu.Q().S();
      if ($$0 != null && $$0.e()) {
         return grq.c.a;
      } else {
         return fcu.Q().U() ? grq.c.b : grq.c.c;
      }
   }

   public boolean a(grn $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gro.b, $$0x -> {
            $$0x.a(grq.n, this.b);
            if (this.d != null) {
               $$0x.a(grq.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(czr $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? grq.b.e : grq.b.a;
         case b -> grq.b.b;
         case c -> grq.b.c;
         case d -> grq.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
