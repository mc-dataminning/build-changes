import javax.annotation.Nullable;

public class ggx {
   private boolean a;
   @Nullable
   private ggr.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public ggx(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(ggs.a $$0) {
      if (this.c != null) {
         $$0.a(ggr.j, !this.c.equals("vanilla"));
      }

      $$0.a(ggr.k, this.a());
   }

   private ggr.c a() {
      flu $$0 = etd.N().P();
      if ($$0 != null && $$0.e()) {
         return ggr.c.a;
      } else {
         return etd.N().R() ? ggr.c.b : ggr.c.c;
      }
   }

   public boolean a(ggo $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(ggp.b, $$0x -> {
            $$0x.a(ggr.n, this.b);
            if (this.d != null) {
               $$0x.a(ggr.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(crx $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? ggr.b.e : ggr.b.a;
         case b -> ggr.b.b;
         case c -> ggr.b.c;
         case d -> ggr.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
