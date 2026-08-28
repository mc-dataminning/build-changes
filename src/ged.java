import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class ged {
   private final gei a = new gei();
   private final gej b;
   private final gdx.a c;
   private final gdx.a d;
   private final gdy e;

   public ged(int $$0) {
      this.b = gej.a($$0);
      SortedMap<gef, fab> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gem.h(), this.a.a(gef.c()));
         $$0x.put(gem.i(), this.a.a(gef.e()));
         $$0x.put(gem.a(), this.a.a(gef.d()));
         $$0x.put(gem.k(), this.a.a(gef.f()));
         a($$0x, gem.b());
         a($$0x, gem.c());
         a($$0x, gem.d());
         a($$0x, gem.e());
         a($$0x, gem.f());
         $$0x.put(gem.g(), new fab(786432));
         a($$0x, gef.j());
         a($$0x, gef.k());
         a($$0x, gef.m());
         a($$0x, gef.n());
         a($$0x, gef.l());
         a($$0x, gef.o());
         a($$0x, gef.p());
         a($$0x, gef.i());
         gro.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gdx.a(new fab(1536));
      this.c = gdx.a($$1, new fab(786432));
      this.e = new gdy(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gef, fab> $$0, gef $$1) {
      $$0.put($$1, new fab($$1.I()));
   }

   public gei a() {
      return this.a;
   }

   public gej b() {
      return this.b;
   }

   public gdx.a c() {
      return this.c;
   }

   public gdx.a d() {
      return this.d;
   }

   public gdy e() {
      return this.e;
   }
}
