import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gpl {
   private final gpq a = new gpq();
   private final gpr b;
   private final gpd.a c;
   private final gpd.a d;
   private final gpf e;

   public gpl(int $$0) {
      this.b = gpr.a($$0);
      SequencedMap<gpn, fin> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gpy.h(), this.a.a(gpn.c()));
         $$0x.put(gpy.i(), this.a.a(gpn.e()));
         $$0x.put(gpy.a(), this.a.a(gpn.d()));
         $$0x.put(gpy.j(), this.a.a(gpn.f()));
         a($$0x, gpy.b());
         a($$0x, gpy.c());
         a($$0x, gpy.d());
         a($$0x, gpy.e());
         a($$0x, gpy.f());
         $$0x.put(gpy.g(), new fin(786432));
         a($$0x, gpn.j());
         a($$0x, gpn.l());
         a($$0x, gpn.k());
         a($$0x, gpn.m());
         a($$0x, gpn.i());
      });
      this.c = gpd.a($$1, new fin(786432));
      this.e = new gpf(this.c);
      SequencedMap<gpn, fin> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hkj.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gpd.a($$2, new fin(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gpn, fin> $$0, gpn $$1) {
      $$0.put($$1, new fin($$1.R()));
   }

   public gpq a() {
      return this.a;
   }

   public gpr b() {
      return this.b;
   }

   public gpd.a c() {
      return this.c;
   }

   public gpd.a d() {
      return this.d;
   }

   public gpf e() {
      return this.e;
   }
}
