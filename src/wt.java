import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public interface wt {
   Codec<wt> a = wt.a.h.dispatch("action", wt::a, $$0 -> $$0.k);

   wt.a a();

   public static enum a implements bag {
      a("open_url", true, wt.e.b),
      b("open_file", false, wt.d.b),
      c("run_command", true, wt.f.b),
      d("suggest_command", true, wt.g.b),
      e("change_page", true, wt.b.b),
      f("copy_to_clipboard", true, wt.c.b);

      public static final Codec<wt.a> g = bag.a(wt.a::values);
      public static final Codec<wt.a> h = g.validate(wt.a::a);
      private final boolean i;
      private final String j;
      final MapCodec<? extends wt> k;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends wt> $$2) {
         this.j = $$0;
         this.i = $$1;
         this.k = $$2;
      }

      public boolean a() {
         return this.i;
      }

      @Override
      public String c() {
         return this.j;
      }

      public static DataResult<wt.a> a(wt.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static record b(int c) implements wt {
      public static final MapCodec<wt.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.m.fieldOf("page").forGetter(wt.b::b)).apply($$0, wt.b::new));

      @Override
      public wt.a a() {
         return wt.a.e;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(String c) implements wt {
      public static final MapCodec<wt.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(wt.c::b)).apply($$0, wt.c::new)
      );

      @Override
      public wt.a a() {
         return wt.a.f;
      }

      public String b() {
         return this.c;
      }
   }

   public static record d(String c) implements wt {
      public static final MapCodec<wt.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(wt.d::c)).apply($$0, wt.d::new)
      );

      public d(File $$0) {
         this($$0.toString());
      }

      public d(Path $$0) {
         this($$0.toFile());
      }

      public File b() {
         return new File(this.c);
      }

      @Override
      public wt.a a() {
         return wt.a.b;
      }
   }

   public static record e(URI c) implements wt {
      public static final MapCodec<wt.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.D.fieldOf("url").forGetter(wt.e::b)).apply($$0, wt.e::new));

      @Override
      public wt.a a() {
         return wt.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public static record f(String c) implements wt {
      public static final MapCodec<wt.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.E.fieldOf("command").forGetter(wt.f::b)).apply($$0, wt.f::new));

      @Override
      public wt.a a() {
         return wt.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public static record g(String c) implements wt {
      public static final MapCodec<wt.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.E.fieldOf("command").forGetter(wt.g::b)).apply($$0, wt.g::new));

      @Override
      public wt.a a() {
         return wt.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
