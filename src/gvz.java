import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gvz {
   static final Map<String, gvz> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gvz> a = Codec.STRING.comapFlatMap($$0 -> {
      gvz $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gvz::a);
   private static final List<gwb<?>> i = List.of(gwb.a, gwb.b, gwb.c, gwb.d, gwb.e, gwb.f, gwb.g, gwb.h, gwb.m, gwb.l);
   private static final List<gwb<?>> j = Stream.concat(i.stream(), Stream.of(gwb.i, gwb.j, gwb.k)).toList();
   public static final gvz b = a("world_loaded", "WorldLoaded").a(j).a(gwb.n).a(gwb.o).b();
   public static final gvz c = a("performance_metrics", "PerformanceMetrics").a(j).a(gwb.r).a(gwb.s).a(gwb.t).a(gwb.u).a(gwb.v).a(gwb.w).a().b();
   public static final gvz d = a("world_load_times", "WorldLoadTimes").a(j).a(gwb.x).a(gwb.y).a().b();
   public static final gvz e = a("world_unloaded", "WorldUnloaded").a(j).a(gwb.p).a(gwb.q).b();
   public static final gvz f = a("advancement_made", "AdvancementMade").a(j).a(gwb.D).a(gwb.E).a().b();
   public static final gvz g = a("game_load_times", "GameLoadTimes").a(i).a(gwb.z).a(gwb.A).a(gwb.B).a(gwb.C).a().b();
   private final String k;
   private final String l;
   private final List<gwb<?>> m;
   private final boolean n;
   private final Codec<gvv> o;

   gvz(String $$0, String $$1, List<gwb<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gwc.a($$2).xmap($$0x -> new gvv(this, $$0x), gvv::b);
   }

   public static gvz.a a(String $$0, String $$1) {
      return new gvz.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gwb<?>> b() {
      return this.m;
   }

   public Codec<gvv> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gwc $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gwb<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gwb<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xs e() {
      return this.a("title");
   }

   public xs f() {
      return this.a("description");
   }

   private xs a(String $$0) {
      return xe.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gvz> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gwb<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gvz.a a(List<gwb<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gvz.a a(gwb<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gvz.a a() {
         this.d = true;
         return this;
      }

      public gvz b() {
         gvz $$0 = new gvz(this.a, this.b, List.copyOf(this.c), this.d);
         if (gvz.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
