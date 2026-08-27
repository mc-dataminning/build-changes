import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class glt {
   static final Map<String, glt> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<glt> a = Codec.STRING.comapFlatMap($$0 -> {
      glt $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, glt::a);
   private static final List<glv<?>> i = List.of(glv.a, glv.b, glv.c, glv.d, glv.e, glv.f, glv.g, glv.h, glv.m, glv.l);
   private static final List<glv<?>> j = Stream.concat(i.stream(), Stream.of(glv.i, glv.j, glv.k)).toList();
   public static final glt b = a("world_loaded", "WorldLoaded").a(j).a(glv.n).a(glv.o).b();
   public static final glt c = a("performance_metrics", "PerformanceMetrics").a(j).a(glv.r).a(glv.s).a(glv.t).a(glv.u).a(glv.v).a(glv.w).a().b();
   public static final glt d = a("world_load_times", "WorldLoadTimes").a(j).a(glv.x).a(glv.y).a().b();
   public static final glt e = a("world_unloaded", "WorldUnloaded").a(j).a(glv.p).a(glv.q).b();
   public static final glt f = a("advancement_made", "AdvancementMade").a(j).a(glv.D).a(glv.E).a().b();
   public static final glt g = a("game_load_times", "GameLoadTimes").a(i).a(glv.z).a(glv.A).a(glv.B).a(glv.C).a().b();
   private final String k;
   private final String l;
   private final List<glv<?>> m;
   private final boolean n;
   private final Codec<glp> o;

   glt(String $$0, String $$1, List<glv<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = glw.a($$2).xmap($$0x -> new glp(this, $$0x), glp::b);
   }

   public static glt.a a(String $$0, String $$1) {
      return new glt.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<glv<?>> b() {
      return this.m;
   }

   public Codec<glp> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, glw $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (glv<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(glv<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public we e() {
      return this.a("title");
   }

   public we f() {
      return this.a("description");
   }

   private we a(String $$0) {
      return vq.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<glt> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<glv<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public glt.a a(List<glv<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> glt.a a(glv<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public glt.a a() {
         this.d = true;
         return this;
      }

      public glt b() {
         glt $$0 = new glt(this.a, this.b, List.copyOf(this.c), this.d);
         if (glt.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
