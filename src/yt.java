import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class yt implements uo<ur> {
   private final boolean a;
   private final Map<acq, ae.a> b;
   private final Set<acq> c;
   private final Map<acq, ag> d;

   public yt(boolean $$0, Collection<ae> $$1, Set<acq> $$2, Map<acq, ag> $$3) {
      this.a = $$0;
      Builder<acq, ae.a> $$4 = ImmutableMap.builder();

      for (ae $$5 : $$1) {
         $$4.put($$5.j(), $$5.a());
      }

      this.b = $$4.build();
      this.c = ImmutableSet.copyOf($$2);
      this.d = ImmutableMap.copyOf($$3);
   }

   public yt(sf $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(sf::t, ae.a::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, sf::t);
      this.d = $$0.a(sf::t, ag::b);
   }

   @Override
   public void a(sf $$0) {
      $$0.writeBoolean(this.a);
      $$0.a(this.b, sf::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, sf::a);
      $$0.a(this.d, sf::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public Map<acq, ae.a> a() {
      return this.b;
   }

   public Set<acq> c() {
      return this.c;
   }

   public Map<acq, ag> d() {
      return this.d;
   }

   public boolean e() {
      return this.a;
   }
}
