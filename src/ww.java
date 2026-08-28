import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public interface ww {
   Codec<ww> a = ww.a.h.dispatch("action", ww::a, $$0 -> $$0.k);

   ww.a a();

   public static enum a implements bak {
      a("open_url", true, ww.e.b),
      b("open_file", false, ww.d.b),
      c("run_command", true, ww.f.b),
      d("suggest_command", true, ww.g.b),
      e("change_page", true, ww.b.b),
      f("copy_to_clipboard", true, ww.c.b);

      public static final Codec<ww.a> g = bak.a(ww.a::values);
      public static final Codec<ww.a> h = g.validate(ww.a::a);
      private final boolean i;
      private final String j;
      final MapCodec<? extends ww> k;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends ww> $$2) {
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

      public static DataResult<ww.a> a(ww.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static record b(int c) implements ww {
      public static final MapCodec<ww.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.m.fieldOf("page").forGetter(ww.b::b)).apply($$0, ww.b::new));

      @Override
      public ww.a a() {
         return ww.a.e;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(String c) implements ww {
      public static final MapCodec<ww.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(ww.c::b)).apply($$0, ww.c::new)
      );

      @Override
      public ww.a a() {
         return ww.a.f;
      }

      public String b() {
         return this.c;
      }
   }

   public static record d(String c) implements ww {
      public static final MapCodec<ww.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(ww.d::c)).apply($$0, ww.d::new)
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
      public ww.a a() {
         return ww.a.b;
      }
   }

   public static record e(URI c) implements ww {
      public static final MapCodec<ww.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.D.fieldOf("url").forGetter(ww.e::b)).apply($$0, ww.e::new));

      @Override
      public ww.a a() {
         return ww.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public static record f(String c) implements ww {
      public static final MapCodec<ww.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.E.fieldOf("command").forGetter(ww.f::b)).apply($$0, ww.f::new));

      @Override
      public ww.a a() {
         return ww.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public static record g(String c) implements ww {
      public static final MapCodec<ww.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.E.fieldOf("command").forGetter(ww.g::b)).apply($$0, ww.g::new));

      @Override
      public ww.a a() {
         return ww.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
