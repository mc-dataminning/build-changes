import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gqs {
   static final Map<String, gqs> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gqs> a = Codec.STRING.comapFlatMap($$0 -> {
      gqs $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gqs::a);
   private static final List<gqu<?>> i = List.of(gqu.a, gqu.b, gqu.c, gqu.d, gqu.e, gqu.f, gqu.g, gqu.h, gqu.m, gqu.l);
   private static final List<gqu<?>> j = Stream.concat(i.stream(), Stream.of(gqu.i, gqu.j, gqu.k)).toList();
   public static final gqs b = a("world_loaded", "WorldLoaded").a(j).a(gqu.n).a(gqu.o).b();
   public static final gqs c = a("performance_metrics", "PerformanceMetrics").a(j).a(gqu.r).a(gqu.s).a(gqu.t).a(gqu.u).a(gqu.v).a(gqu.w).a().b();
   public static final gqs d = a("world_load_times", "WorldLoadTimes").a(j).a(gqu.x).a(gqu.y).a().b();
   public static final gqs e = a("world_unloaded", "WorldUnloaded").a(j).a(gqu.p).a(gqu.q).b();
   public static final gqs f = a("advancement_made", "AdvancementMade").a(j).a(gqu.D).a(gqu.E).a().b();
   public static final gqs g = a("game_load_times", "GameLoadTimes").a(i).a(gqu.z).a(gqu.A).a(gqu.B).a(gqu.C).a().b();
   private final String k;
   private final String l;
   private final List<gqu<?>> m;
   private final boolean n;
   private final Codec<gqo> o;

   gqs(String $$0, String $$1, List<gqu<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gqv.a($$2).xmap($$0x -> new gqo(this, $$0x), gqo::b);
   }

   public static gqs.a a(String $$0, String $$1) {
      return new gqs.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gqu<?>> b() {
      return this.m;
   }

   public Codec<gqo> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gqv $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gqu<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gqu<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public ww e() {
      return this.a("title");
   }

   public ww f() {
      return this.a("description");
   }

   private ww a(String $$0) {
      return wi.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gqs> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gqu<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gqs.a a(List<gqu<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gqs.a a(gqu<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gqs.a a() {
         this.d = true;
         return this;
      }

      public gqs b() {
         gqs $$0 = new gqs(this.a, this.b, List.copyOf(this.c), this.d);
         if (gqs.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
