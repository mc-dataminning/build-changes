import javax.annotation.Nullable;

public class hmm {
   private boolean a;
   @Nullable
   private hmg.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hmm(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hmh.a $$0) {
      if (this.c != null) {
         $$0.a(hmg.j, !this.c.equals("vanilla"));
      }

      $$0.a(hmg.k, this.a());
   }

   private hmg.c a() {
      gio $$0 = fnd.Q().S();
      if ($$0 != null && $$0.e()) {
         return hmg.c.a;
      } else {
         return fnd.Q().U() ? hmg.c.b : hmg.c.c;
      }
   }

   public boolean a(hmd $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hme.b, $$0x -> {
            $$0x.a(hmg.n, this.b);
            if (this.d != null) {
               $$0x.a(hmg.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dhm $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hmg.b.e : hmg.b.a;
         case b -> hmg.b.b;
         case c -> hmg.b.c;
         case d -> hmg.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
