import javax.annotation.Nullable;

public class hpl {
   private boolean a;
   @Nullable
   private hpf.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hpl(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hpg.a $$0) {
      if (this.c != null) {
         $$0.a(hpf.j, !this.c.equals("vanilla"));
      }

      $$0.a(hpf.k, this.a());
   }

   private hpf.c a() {
      glf $$0 = fpt.Q().S();
      if ($$0 != null && $$0.e()) {
         return hpf.c.a;
      } else {
         return fpt.Q().U() ? hpf.c.b : hpf.c.c;
      }
   }

   public boolean a(hpc $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hpd.b, $$0x -> {
            $$0x.a(hpf.n, this.b);
            if (this.d != null) {
               $$0x.a(hpf.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(djj $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hpf.b.e : hpf.b.a;
         case b -> hpf.b.b;
         case c -> hpf.b.c;
         case d -> hpf.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
