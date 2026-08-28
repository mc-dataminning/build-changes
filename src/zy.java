import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zy(zy.a c) implements aac {
   public static final ys<vr, zy> a = aac.a(zy::a, zy::new);
   public static final aac.b<zy> b = aac.a("debug/bee");

   private zy(vr $$0) {
      this(new zy.a($$0));
   }

   private void a(vr $$0) {
      this.c.a($$0);
   }

   @Override
   public aac.b<zy> a() {
      return b;
   }

   public zy.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ewh c, @Nullable eox d, @Nullable ja e, @Nullable ja f, int g, Set<String> h, List<ja> i) {
      public a(vr $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eox::b), $$0.c(ja.b), $$0.c(ja.b), $$0.readInt(), $$0.a(HashSet::new, vr::p), $$0.a(ja.b));
      }

      public void a(vr $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ja.b);
         $$0.a(this.f, ja.b);
         $$0.p(this.g);
         $$0.a(this.h, vr::a);
         $$0.a(this.i, ja.b);
      }

      public boolean a(ja $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return afx.a(this.a);
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

      public ewh d() {
         return this.c;
      }

      @Nullable
      public eox e() {
         return this.d;
      }

      @Nullable
      public ja f() {
         return this.e;
      }

      @Nullable
      public ja g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<ja> j() {
         return this.i;
      }
   }
}
