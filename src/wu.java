import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public interface wu {
   Codec<wu> a = wu.a.h.dispatch("action", wu::a, $$0 -> $$0.k);

   wu.a a();

   public static enum a implements bai {
      a("open_url", true, wu.e.b),
      b("open_file", false, wu.d.b),
      c("run_command", true, wu.f.b),
      d("suggest_command", true, wu.g.b),
      e("change_page", true, wu.b.b),
      f("copy_to_clipboard", true, wu.c.b);

      public static final Codec<wu.a> g = bai.a(wu.a::values);
      public static final Codec<wu.a> h = g.validate(wu.a::a);
      private final boolean i;
      private final String j;
      final MapCodec<? extends wu> k;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends wu> $$2) {
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

      public static DataResult<wu.a> a(wu.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static record b(int c) implements wu {
      public static final MapCodec<wu.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.m.fieldOf("page").forGetter(wu.b::b)).apply($$0, wu.b::new));

      @Override
      public wu.a a() {
         return wu.a.e;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(String c) implements wu {
      public static final MapCodec<wu.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(wu.c::b)).apply($$0, wu.c::new)
      );

      @Override
      public wu.a a() {
         return wu.a.f;
      }

      public String b() {
         return this.c;
      }
   }

   public static record d(String c) implements wu {
      public static final MapCodec<wu.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(wu.d::c)).apply($$0, wu.d::new)
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
      public wu.a a() {
         return wu.a.b;
      }
   }

   public static record e(URI c) implements wu {
      public static final MapCodec<wu.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.D.fieldOf("url").forGetter(wu.e::b)).apply($$0, wu.e::new));

      @Override
      public wu.a a() {
         return wu.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public static record f(String c) implements wu {
      public static final MapCodec<wu.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.E.fieldOf("command").forGetter(wu.f::b)).apply($$0, wu.f::new));

      @Override
      public wu.a a() {
         return wu.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public static record g(String c) implements wu {
      public static final MapCodec<wu.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.E.fieldOf("command").forGetter(wu.g::b)).apply($$0, wu.g::new));

      @Override
      public wu.a a() {
         return wu.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
