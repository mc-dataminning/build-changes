import javax.annotation.Nullable;

public class fzt {
   private boolean a;
   @Nullable
   private fzn.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public fzt(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(fzo.a $$0) {
      if (this.c != null) {
         $$0.a(fzn.j, !this.c.equals("vanilla"));
      }

      $$0.a(fzn.k, this.a());
   }

   private fzn.c a() {
      if (enn.N().ar()) {
         return fzn.c.a;
      } else {
         return enn.N().R() ? fzn.c.b : fzn.c.c;
      }
   }

   public boolean a(fzk $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(fzl.b, $$0x -> {
            $$0x.a(fzn.n, this.b);
            if (this.d != null) {
               $$0x.a(fzn.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cmj $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? fzn.b.e : fzn.b.a;
         case b -> fzn.b.b;
         case c -> fzn.b.c;
         case d -> fzn.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
