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

public class gvm {
   static final Map<String, gvm> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gvm> a = Codec.STRING.comapFlatMap($$0 -> {
      gvm $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gvm::a);
   private static final List<gvo<?>> i = List.of(gvo.a, gvo.b, gvo.c, gvo.d, gvo.e, gvo.f, gvo.g, gvo.h, gvo.m, gvo.l);
   private static final List<gvo<?>> j = Stream.concat(i.stream(), Stream.of(gvo.i, gvo.j, gvo.k)).toList();
   public static final gvm b = a("world_loaded", "WorldLoaded").a(j).a(gvo.n).a(gvo.o).b();
   public static final gvm c = a("performance_metrics", "PerformanceMetrics").a(j).a(gvo.r).a(gvo.s).a(gvo.t).a(gvo.u).a(gvo.v).a(gvo.w).a().b();
   public static final gvm d = a("world_load_times", "WorldLoadTimes").a(j).a(gvo.x).a(gvo.y).a().b();
   public static final gvm e = a("world_unloaded", "WorldUnloaded").a(j).a(gvo.p).a(gvo.q).b();
   public static final gvm f = a("advancement_made", "AdvancementMade").a(j).a(gvo.D).a(gvo.E).a().b();
   public static final gvm g = a("game_load_times", "GameLoadTimes").a(i).a(gvo.z).a(gvo.A).a(gvo.B).a(gvo.C).a().b();
   private final String k;
   private final String l;
   private final List<gvo<?>> m;
   private final boolean n;
   private final MapCodec<gvi> o;

   gvm(String $$0, String $$1, List<gvo<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gvp.a($$2).xmap($$0x -> new gvi(this, $$0x), gvi::b);
   }

   public static gvm.a a(String $$0, String $$1) {
      return new gvm.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gvo<?>> b() {
      return this.m;
   }

   public MapCodec<gvi> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gvp $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gvo<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gvo<T> $$0) {
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

   public static List<gvm> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gvo<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gvm.a a(List<gvo<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gvm.a a(gvo<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gvm.a a() {
         this.d = true;
         return this;
      }

      public gvm b() {
         gvm $$0 = new gvm(this.a, this.b, List.copyOf(this.c), this.d);
         if (gvm.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
