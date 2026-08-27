import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vm(vm.a b) implements vp {
   public static final aer a = new aer("debug/bee");

   public vm(si $$0) {
      this(new vm.a($$0));
   }

   @Override
   public void a(si $$0) {
      this.b.a($$0);
   }

   @Override
   public aer a() {
      return a;
   }

   public static record a(UUID a, int b, ehd c, @Nullable ear d, @Nullable gu e, @Nullable gu f, int g, Set<String> h, List<gu> i) {
      public a(si $$0) {
         this($$0.o(), $$0.readInt(), $$0.k(), $$0.c(ear::b), $$0.c(si::e), $$0.c(si::e), $$0.readInt(), $$0.a(HashSet::new, si::r), $$0.a(si::e));
      }

      public void a(si $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, si::a);
         $$0.a(this.f, si::a);
         $$0.p(this.g);
         $$0.a(this.h, si::a);
         $$0.a(this.i, si::a);
      }

      public boolean a(gu $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aau.a(this.a);
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

      public ehd d() {
         return this.c;
      }

      @Nullable
      public ear e() {
         return this.d;
      }

      @Nullable
      public gu f() {
         return this.e;
      }

      @Nullable
      public gu g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<gu> j() {
         return this.i;
      }
   }
}
