import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public interface xe {
   Codec<xe> a = xe.a.h.dispatch("action", xe::a, $$0 -> $$0.k);

   xe.a a();

   public static enum a implements bax {
      a("open_url", true, xe.e.b),
      b("open_file", false, xe.d.b),
      c("run_command", true, xe.f.b),
      d("suggest_command", true, xe.g.b),
      e("change_page", true, xe.b.b),
      f("copy_to_clipboard", true, xe.c.b);

      public static final Codec<xe.a> g = bax.a(xe.a::values);
      public static final Codec<xe.a> h = g.validate(xe.a::a);
      private final boolean i;
      private final String j;
      final MapCodec<? extends xe> k;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xe> $$2) {
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

      public static DataResult<xe.a> a(xe.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static record b(int c) implements xe {
      public static final MapCodec<xe.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.m.fieldOf("page").forGetter(xe.b::b)).apply($$0, xe.b::new));

      @Override
      public xe.a a() {
         return xe.a.e;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(String c) implements xe {
      public static final MapCodec<xe.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(xe.c::b)).apply($$0, xe.c::new)
      );

      @Override
      public xe.a a() {
         return xe.a.f;
      }

      public String b() {
         return this.c;
      }
   }

   public static record d(String c) implements xe {
      public static final MapCodec<xe.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(xe.d::c)).apply($$0, xe.d::new)
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
      public xe.a a() {
         return xe.a.b;
      }
   }

   public static record e(URI c) implements xe {
      public static final MapCodec<xe.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.D.fieldOf("url").forGetter(xe.e::b)).apply($$0, xe.e::new));

      @Override
      public xe.a a() {
         return xe.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public static record f(String c) implements xe {
      public static final MapCodec<xe.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.E.fieldOf("command").forGetter(xe.f::b)).apply($$0, xe.f::new));

      @Override
      public xe.a a() {
         return xe.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public static record g(String c) implements xe {
      public static final MapCodec<xe.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.E.fieldOf("command").forGetter(xe.g::b)).apply($$0, xe.g::new));

      @Override
      public xe.a a() {
         return xe.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
