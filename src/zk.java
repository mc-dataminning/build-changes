import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zk(zk.a c) implements zo {
   public static final ye<vg, zk> a = zo.a(zk::a, zk::new);
   public static final zo.b<zk> b = zo.a("debug/bee");

   private zk(vg $$0) {
      this(new zk.a($$0));
   }

   private void a(vg $$0) {
      this.c.a($$0);
   }

   @Override
   public zo.b<zk> a() {
      return b;
   }

   public zk.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, esa c, @Nullable elg d, @Nullable ib e, @Nullable ib f, int g, Set<String> h, List<ib> i) {
      public a(vg $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(elg::b), $$0.c(ib.b), $$0.c(ib.b), $$0.readInt(), $$0.a(HashSet::new, vg::p), $$0.a(ib.b));
      }

      public void a(vg $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ib.b);
         $$0.a(this.f, ib.b);
         $$0.p(this.g);
         $$0.a(this.h, vg::a);
         $$0.a(this.i, ib.b);
      }

      public boolean a(ib $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return afh.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public esa d() {
         return this.c;
      }

      @Nullable
      public elg e() {
         return this.d;
      }

      @Nullable
      public ib f() {
         return this.e;
      }

      @Nullable
      public ib g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<ib> j() {
         return this.i;
      }
   }
}
