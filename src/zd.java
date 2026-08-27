import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class zd implements vd<ww> {
   private final zd.a a;
   private final List<aew> b;
   private final List<aew> c;
   private final aph d;

   public zd(zd.a $$0, Collection<aew> $$1, Collection<aew> $$2, aph $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public zd(so $$0) {
      this.a = $$0.b(zd.a.class);
      this.d = aph.a($$0);
      this.b = $$0.a(so::s);
      if (this.a == zd.a.a) {
         this.c = $$0.a(so::s);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, so::a);
      if (this.a == zd.a.a) {
         $$0.a(this.c, so::a);
      }
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public List<aew> a() {
      return this.b;
   }

   public List<aew> d() {
      return this.c;
   }

   public aph e() {
      return this.d;
   }

   public zd.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
