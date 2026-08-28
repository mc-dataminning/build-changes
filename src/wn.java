import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public interface wn {
   Codec<wn> a = wn.a.h.dispatch("action", wn::a, $$0 -> $$0.k);

   wn.a a();

   public static enum a implements azv {
      a("open_url", true, wn.e.b),
      b("open_file", false, wn.d.b),
      c("run_command", true, wn.f.b),
      d("suggest_command", true, wn.g.b),
      e("change_page", true, wn.b.b),
      f("copy_to_clipboard", true, wn.c.b);

      public static final Codec<wn.a> g = azv.a(wn.a::values);
      public static final Codec<wn.a> h = g.validate(wn.a::a);
      private final boolean i;
      private final String j;
      final MapCodec<? extends wn> k;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends wn> $$2) {
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

      public static DataResult<wn.a> a(wn.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static record b(int c) implements wn {
      public static final MapCodec<wn.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.m.fieldOf("page").forGetter(wn.b::b)).apply($$0, wn.b::new));

      @Override
      public wn.a a() {
         return wn.a.e;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(String c) implements wn {
      public static final MapCodec<wn.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(wn.c::b)).apply($$0, wn.c::new)
      );

      @Override
      public wn.a a() {
         return wn.a.f;
      }

      public String b() {
         return this.c;
      }
   }

   public static record d(String c) implements wn {
      public static final MapCodec<wn.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(wn.d::c)).apply($$0, wn.d::new)
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
      public wn.a a() {
         return wn.a.b;
      }
   }

   public static record e(URI c) implements wn {
      public static final MapCodec<wn.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.D.fieldOf("url").forGetter(wn.e::b)).apply($$0, wn.e::new));

      @Override
      public wn.a a() {
         return wn.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public static record f(String c) implements wn {
      public static final MapCodec<wn.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.E.fieldOf("command").forGetter(wn.f::b)).apply($$0, wn.f::new));

      @Override
      public wn.a a() {
         return wn.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public static record g(String c) implements wn {
      public static final MapCodec<wn.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.E.fieldOf("command").forGetter(wn.g::b)).apply($$0, wn.g::new));

      @Override
      public wn.a a() {
         return wn.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
