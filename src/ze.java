import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class ze implements ve<wx> {
   private final ze.a a;
   private final List<aez> b;
   private final List<aez> c;
   private final apk d;

   public ze(ze.a $$0, Collection<aez> $$1, Collection<aez> $$2, apk $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public ze(so $$0) {
      this.a = $$0.b(ze.a.class);
      this.d = apk.a($$0);
      this.b = $$0.a(so::t);
      if (this.a == ze.a.a) {
         this.c = $$0.a(so::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, so::a);
      if (this.a == ze.a.a) {
         $$0.a(this.c, so::a);
      }
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public List<aez> a() {
      return this.b;
   }

   public List<aez> d() {
      return this.c;
   }

   public apk e() {
      return this.d;
   }

   public ze.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
