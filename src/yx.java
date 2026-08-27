import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class yx implements uo<ur> {
   private final List<cjc<?>> a;

   public yx(Collection<cjc<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public yx(sf $$0) {
      this.a = $$0.a(yx::b);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, yx::a);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public List<cjc<?>> a() {
      return this.a;
   }

   public static cjc<?> b(sf $$0) {
      acq $$1 = $$0.t();
      acq $$2 = $$0.t();
      return jb.u.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1)).a($$2, $$0);
   }

   public static <T extends cjc<?>> void a(sf $$0, T $$1) {
      $$0.a(jb.u.b($$1.aj_()));
      $$0.a($$1.e());
      ((cje<T>)$$1.aj_()).a($$0, $$1);
   }
}
