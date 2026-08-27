import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gbk {
   private final gbp a = new gbp();
   private final gbq b;
   private final gbe.a c;
   private final gbe.a d;
   private final gbf e;

   public gbk(int $$0) {
      this.b = gbq.a($$0);
      SortedMap<gbm, exi> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gbt.h(), this.a.a(gbm.c()));
         $$0x.put(gbt.i(), this.a.a(gbm.e()));
         $$0x.put(gbt.a(), this.a.a(gbm.d()));
         $$0x.put(gbt.k(), this.a.a(gbm.f()));
         a($$0x, gbt.b());
         a($$0x, gbt.c());
         a($$0x, gbt.d());
         a($$0x, gbt.e());
         a($$0x, gbt.f());
         $$0x.put(gbt.g(), new exi(786432));
         a($$0x, gbm.j());
         a($$0x, gbm.k());
         a($$0x, gbm.m());
         a($$0x, gbm.n());
         a($$0x, gbm.l());
         a($$0x, gbm.o());
         a($$0x, gbm.p());
         a($$0x, gbm.i());
         got.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gbe.a(new exi(1536));
      this.c = gbe.a($$1, new exi(786432));
      this.e = new gbf(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gbm, exi> $$0, gbm $$1) {
      $$0.put($$1, new exi($$1.I()));
   }

   public gbp a() {
      return this.a;
   }

   public gbq b() {
      return this.b;
   }

   public gbe.a c() {
      return this.c;
   }

   public gbe.a d() {
      return this.d;
   }

   public gbf e() {
      return this.e;
   }
}
