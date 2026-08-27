import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record un(uo j, uo k) {
   public static final Codec<un> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(uo.a.fieldOf("chat").forGetter(un::a), uo.a.fieldOf("narration").forGetter(un::b)).apply($$0, un::new)
   );
   public static final uo b = uo.a("chat.type.text");
   public static final agf<un> c = a("chat");
   public static final agf<un> d = a("say_command");
   public static final agf<un> e = a("msg_command_incoming");
   public static final agf<un> f = a("msg_command_outgoing");
   public static final agf<un> g = a("team_msg_command_incoming");
   public static final agf<un> h = a("team_msg_command_outgoing");
   public static final agf<un> i = a("emote_command");

   private static agf<un> a(String $$0) {
      return agf.a(jz.as, new agg($$0));
   }

   public static void a(ou<un> $$0) {
      $$0.a(c, new un(b, uo.a("chat.type.text.narrate")));
      $$0.a(d, new un(uo.a("chat.type.announcement"), uo.a("chat.type.text.narrate")));
      $$0.a(e, new un(uo.b("commands.message.display.incoming"), uo.a("chat.type.text.narrate")));
      $$0.a(f, new un(uo.c("commands.message.display.outgoing"), uo.a("chat.type.text.narrate")));
      $$0.a(g, new un(uo.d("chat.type.team.text"), uo.a("chat.type.text.narrate")));
      $$0.a(h, new un(uo.d("chat.type.team.sent"), uo.a("chat.type.text.narrate")));
      $$0.a(i, new un(uo.a("chat.type.emote"), uo.a("chat.type.emote")));
   }

   public static un.a a(agf<un> $$0, bki $$1) {
      return a($$0, $$1.dL().H_(), $$1.O_());
   }

   public static un.a a(agf<un> $$0, du $$1) {
      return a($$0, $$1.v(), $$1.c());
   }

   public static un.a a(agf<un> $$0, ip $$1, ur $$2) {
      io<un> $$3 = $$1.d(jz.as);
      return $$3.e($$0).a($$2);
   }

   public un.a a(ur $$0) {
      return new un.a(this, $$0);
   }

   public uo a() {
      return this.j;
   }

   public uo b() {
      return this.k;
   }

   public static record a(un a, ur b, @Nullable ur c) {
      a(un $$0, ur $$1) {
         this($$0, $$1, null);
      }

      public ur a(ur $$0) {
         return this.a.a().a($$0, this);
      }

      public ur b(ur $$0) {
         return this.a.b().a($$0, this);
      }

      public un.a c(ur $$0) {
         return new un.a(this.a, this.b, $$0);
      }

      public un.b a(ip $$0) {
         io<un> $$1 = $$0.d(jz.as);
         return new un.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, ur b, @Nullable ur c) {
      public b(tu $$0) {
         this($$0.n(), $$0.m(), $$0.c(tu::m));
      }

      public void a(tu $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, tu::a);
      }

      public Optional<un.a> a(ip $$0) {
         io<un> $$1 = $$0.d(jz.as);
         un $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new un.a($$0x, this.b, this.c));
      }
   }
}
