import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class glu {
   static final Map<String, glu> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<glu> a = Codec.STRING.comapFlatMap($$0 -> {
      glu $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, glu::a);
   private static final List<glw<?>> i = List.of(glw.a, glw.b, glw.c, glw.d, glw.e, glw.f, glw.g, glw.h, glw.m, glw.l);
   private static final List<glw<?>> j = Stream.concat(i.stream(), Stream.of(glw.i, glw.j, glw.k)).toList();
   public static final glu b = a("world_loaded", "WorldLoaded").a(j).a(glw.n).a(glw.o).b();
   public static final glu c = a("performance_metrics", "PerformanceMetrics").a(j).a(glw.r).a(glw.s).a(glw.t).a(glw.u).a(glw.v).a(glw.w).a().b();
   public static final glu d = a("world_load_times", "WorldLoadTimes").a(j).a(glw.x).a(glw.y).a().b();
   public static final glu e = a("world_unloaded", "WorldUnloaded").a(j).a(glw.p).a(glw.q).b();
   public static final glu f = a("advancement_made", "AdvancementMade").a(j).a(glw.D).a(glw.E).a().b();
   public static final glu g = a("game_load_times", "GameLoadTimes").a(i).a(glw.z).a(glw.A).a(glw.B).a(glw.C).a().b();
   private final String k;
   private final String l;
   private final List<glw<?>> m;
   private final boolean n;
   private final Codec<glq> o;

   glu(String $$0, String $$1, List<glw<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = glx.a($$2).xmap($$0x -> new glq(this, $$0x), glq::b);
   }

   public static glu.a a(String $$0, String $$1) {
      return new glu.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<glw<?>> b() {
      return this.m;
   }

   public Codec<glq> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, glx $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (glw<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(glw<T> $$0) {
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

   public static List<glu> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<glw<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public glu.a a(List<glw<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> glu.a a(glw<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public glu.a a() {
         this.d = true;
         return this;
      }

      public glu b() {
         glu $$0 = new glu(this.a, this.b, List.copyOf(this.c), this.d);
         if (glu.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
