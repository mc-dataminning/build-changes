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

public class gug {
   static final Map<String, gug> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gug> a = Codec.STRING.comapFlatMap($$0 -> {
      gug $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gug::a);
   private static final List<gui<?>> i = List.of(gui.a, gui.b, gui.c, gui.d, gui.e, gui.f, gui.g, gui.h, gui.m, gui.l);
   private static final List<gui<?>> j = Stream.concat(i.stream(), Stream.of(gui.i, gui.j, gui.k)).toList();
   public static final gug b = a("world_loaded", "WorldLoaded").a(j).a(gui.n).a(gui.o).b();
   public static final gug c = a("performance_metrics", "PerformanceMetrics").a(j).a(gui.r).a(gui.s).a(gui.t).a(gui.u).a(gui.v).a(gui.w).a().b();
   public static final gug d = a("world_load_times", "WorldLoadTimes").a(j).a(gui.x).a(gui.y).a().b();
   public static final gug e = a("world_unloaded", "WorldUnloaded").a(j).a(gui.p).a(gui.q).b();
   public static final gug f = a("advancement_made", "AdvancementMade").a(j).a(gui.D).a(gui.E).a().b();
   public static final gug g = a("game_load_times", "GameLoadTimes").a(i).a(gui.z).a(gui.A).a(gui.B).a(gui.C).a().b();
   private final String k;
   private final String l;
   private final List<gui<?>> m;
   private final boolean n;
   private final MapCodec<guc> o;

   gug(String $$0, String $$1, List<gui<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = guj.a($$2).xmap($$0x -> new guc(this, $$0x), guc::b);
   }

   public static gug.a a(String $$0, String $$1) {
      return new gug.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gui<?>> b() {
      return this.m;
   }

   public MapCodec<guc> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, guj $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gui<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gui<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public yd e() {
      return this.a("title");
   }

   public yd f() {
      return this.a("description");
   }

   private yd a(String $$0) {
      return xp.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gug> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gui<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gug.a a(List<gui<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gug.a a(gui<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gug.a a() {
         this.d = true;
         return this;
      }

      public gug b() {
         gug $$0 = new gug(this.a, this.b, List.copyOf(this.c), this.d);
         if (gug.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
