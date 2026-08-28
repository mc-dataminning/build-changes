import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public interface xa {
   Codec<xa> a = xa.a.h.dispatch("action", xa::a, $$0 -> $$0.k);

   xa.a a();

   public static enum a implements bao {
      a("open_url", true, xa.e.b),
      b("open_file", false, xa.d.b),
      c("run_command", true, xa.f.b),
      d("suggest_command", true, xa.g.b),
      e("change_page", true, xa.b.b),
      f("copy_to_clipboard", true, xa.c.b);

      public static final Codec<xa.a> g = bao.a(xa.a::values);
      public static final Codec<xa.a> h = g.validate(xa.a::a);
      private final boolean i;
      private final String j;
      final MapCodec<? extends xa> k;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xa> $$2) {
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

      public static DataResult<xa.a> a(xa.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static record b(int c) implements xa {
      public static final MapCodec<xa.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.m.fieldOf("page").forGetter(xa.b::b)).apply($$0, xa.b::new));

      @Override
      public xa.a a() {
         return xa.a.e;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(String c) implements xa {
      public static final MapCodec<xa.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(xa.c::b)).apply($$0, xa.c::new)
      );

      @Override
      public xa.a a() {
         return xa.a.f;
      }

      public String b() {
         return this.c;
      }
   }

   public static record d(String c) implements xa {
      public static final MapCodec<xa.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(xa.d::c)).apply($$0, xa.d::new)
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
      public xa.a a() {
         return xa.a.b;
      }
   }

   public static record e(URI c) implements xa {
      public static final MapCodec<xa.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.D.fieldOf("url").forGetter(xa.e::b)).apply($$0, xa.e::new));

      @Override
      public xa.a a() {
         return xa.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public static record f(String c) implements xa {
      public static final MapCodec<xa.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.E.fieldOf("command").forGetter(xa.f::b)).apply($$0, xa.f::new));

      @Override
      public xa.a a() {
         return xa.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public static record g(String c) implements xa {
      public static final MapCodec<xa.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.E.fieldOf("command").forGetter(xa.g::b)).apply($$0, xa.g::new));

      @Override
      public xa.a a() {
         return xa.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
