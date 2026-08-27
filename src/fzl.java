import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class fzl {
   static final Map<String, fzl> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<fzl> a = Codec.STRING.comapFlatMap($$0 -> {
      fzl $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, fzl::a);
   private static final List<fzn<?>> i = List.of(fzn.a, fzn.b, fzn.c, fzn.d, fzn.e, fzn.f, fzn.g, fzn.h, fzn.m, fzn.l);
   private static final List<fzn<?>> j = Stream.concat(i.stream(), Stream.of(fzn.i, fzn.j, fzn.k)).toList();
   public static final fzl b = a("world_loaded", "WorldLoaded").a(j).a(fzn.n).a(fzn.o).b();
   public static final fzl c = a("performance_metrics", "PerformanceMetrics").a(j).a(fzn.r).a(fzn.s).a(fzn.t).a(fzn.u).a(fzn.v).a(fzn.w).a().b();
   public static final fzl d = a("world_load_times", "WorldLoadTimes").a(j).a(fzn.x).a(fzn.y).a().b();
   public static final fzl e = a("world_unloaded", "WorldUnloaded").a(j).a(fzn.p).a(fzn.q).b();
   public static final fzl f = a("advancement_made", "AdvancementMade").a(j).a(fzn.D).a(fzn.E).a().b();
   public static final fzl g = a("game_load_times", "GameLoadTimes").a(i).a(fzn.z).a(fzn.A).a(fzn.B).a(fzn.C).a().b();
   private final String k;
   private final String l;
   private final List<fzn<?>> m;
   private final boolean n;
   private final Codec<fzh> o;

   fzl(String $$0, String $$1, List<fzn<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = fzo.a($$2).xmap($$0x -> new fzh(this, $$0x), fzh::b);
   }

   public static fzl.a a(String $$0, String $$1) {
      return new fzl.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<fzn<?>> b() {
      return this.m;
   }

   public Codec<fzh> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, fzo $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (fzn<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(fzn<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public tj e() {
      return this.a("title");
   }

   public tj f() {
      return this.a("description");
   }

   private tj a(String $$0) {
      return sw.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<fzl> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<fzn<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fzl.a a(List<fzn<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> fzl.a a(fzn<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public fzl.a a() {
         this.d = true;
         return this;
      }

      public fzl b() {
         fzl $$0 = new fzl(this.a, this.b, List.copyOf(this.c), this.d);
         if (fzl.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
