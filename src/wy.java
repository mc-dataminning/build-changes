import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public interface wy {
   Codec<wy> a = wy.a.h.dispatch("action", wy::a, $$0 -> $$0.k);

   wy.a a();

   public static enum a implements bam {
      a("open_url", true, wy.e.b),
      b("open_file", false, wy.d.b),
      c("run_command", true, wy.f.b),
      d("suggest_command", true, wy.g.b),
      e("change_page", true, wy.b.b),
      f("copy_to_clipboard", true, wy.c.b);

      public static final Codec<wy.a> g = bam.a(wy.a::values);
      public static final Codec<wy.a> h = g.validate(wy.a::a);
      private final boolean i;
      private final String j;
      final MapCodec<? extends wy> k;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends wy> $$2) {
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

      public static DataResult<wy.a> a(wy.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Click event type not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static record b(int c) implements wy {
      public static final MapCodec<wy.b> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.m.fieldOf("page").forGetter(wy.b::b)).apply($$0, wy.b::new));

      @Override
      public wy.a a() {
         return wy.a.e;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(String c) implements wy {
      public static final MapCodec<wy.c> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("value").forGetter(wy.c::b)).apply($$0, wy.c::new)
      );

      @Override
      public wy.a a() {
         return wy.a.f;
      }

      public String b() {
         return this.c;
      }
   }

   public static record d(String c) implements wy {
      public static final MapCodec<wy.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.STRING.fieldOf("path").forGetter(wy.d::c)).apply($$0, wy.d::new)
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
      public wy.a a() {
         return wy.a.b;
      }
   }

   public static record e(URI c) implements wy {
      public static final MapCodec<wy.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.D.fieldOf("url").forGetter(wy.e::b)).apply($$0, wy.e::new));

      @Override
      public wy.a a() {
         return wy.a.a;
      }

      public URI b() {
         return this.c;
      }
   }

   public static record f(String c) implements wy {
      public static final MapCodec<wy.f> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.E.fieldOf("command").forGetter(wy.f::b)).apply($$0, wy.f::new));

      @Override
      public wy.a a() {
         return wy.a.c;
      }

      public String b() {
         return this.c;
      }
   }

   public static record g(String c) implements wy {
      public static final MapCodec<wy.g> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.E.fieldOf("command").forGetter(wy.g::b)).apply($$0, wy.g::new));

      @Override
      public wy.a a() {
         return wy.a.d;
      }

      public String b() {
         return this.c;
      }
   }
}
