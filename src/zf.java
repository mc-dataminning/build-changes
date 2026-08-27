import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class zf implements vf<wy> {
   private final zf.a a;
   private final List<aey> b;
   private final List<aey> c;
   private final apj d;

   public zf(zf.a $$0, Collection<aey> $$1, Collection<aey> $$2, apj $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public zf(sq $$0) {
      this.a = $$0.b(zf.a.class);
      this.d = apj.a($$0);
      this.b = $$0.a(sq::s);
      if (this.a == zf.a.a) {
         this.c = $$0.a(sq::s);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, sq::a);
      if (this.a == zf.a.a) {
         $$0.a(this.c, sq::a);
      }
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public List<aey> a() {
      return this.b;
   }

   public List<aey> d() {
      return this.c;
   }

   public apj e() {
      return this.d;
   }

   public zf.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
