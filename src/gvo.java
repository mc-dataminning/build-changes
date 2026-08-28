import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gvo {
   static final Map<String, gvo> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gvo> a = Codec.STRING.comapFlatMap($$0 -> {
      gvo $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gvo::a);
   private static final List<gvq<?>> i = List.of(gvq.a, gvq.b, gvq.c, gvq.d, gvq.e, gvq.f, gvq.g, gvq.h, gvq.m, gvq.l);
   private static final List<gvq<?>> j = Stream.concat(i.stream(), Stream.of(gvq.i, gvq.j, gvq.k)).toList();
   public static final gvo b = a("world_loaded", "WorldLoaded").a(j).a(gvq.n).a(gvq.o).b();
   public static final gvo c = a("performance_metrics", "PerformanceMetrics").a(j).a(gvq.r).a(gvq.s).a(gvq.t).a(gvq.u).a(gvq.v).a(gvq.w).a().b();
   public static final gvo d = a("world_load_times", "WorldLoadTimes").a(j).a(gvq.x).a(gvq.y).a().b();
   public static final gvo e = a("world_unloaded", "WorldUnloaded").a(j).a(gvq.p).a(gvq.q).b();
   public static final gvo f = a("advancement_made", "AdvancementMade").a(j).a(gvq.D).a(gvq.E).a().b();
   public static final gvo g = a("game_load_times", "GameLoadTimes").a(i).a(gvq.z).a(gvq.A).a(gvq.B).a(gvq.C).a().b();
   private final String k;
   private final String l;
   private final List<gvq<?>> m;
   private final boolean n;
   private final MapCodec<gvk> o;

   gvo(String $$0, String $$1, List<gvq<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gvr.a($$2).xmap($$0x -> new gvk(this, $$0x), gvk::b);
   }

   public static gvo.a a(String $$0, String $$1) {
      return new gvo.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gvq<?>> b() {
      return this.m;
   }

   public MapCodec<gvk> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gvr $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gvq<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gvq<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xn e() {
      return this.a("title");
   }

   public xn f() {
      return this.a("description");
   }

   private xn a(String $$0) {
      return wz.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gvo> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gvq<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gvo.a a(List<gvq<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gvo.a a(gvq<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gvo.a a() {
         this.d = true;
         return this;
      }

      public gvo b() {
         gvo $$0 = new gvo(this.a, this.b, List.copyOf(this.c), this.d);
         if (gvo.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
